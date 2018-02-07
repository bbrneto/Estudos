package br.com.alura.agenda.retrofit;

import br.com.alura.agenda.service.AlunoService;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitInicializador {

    private static final String BASE_URL = "http://10.9.51.29:8080/api/";

    private final Retrofit retrofit;

    public RetrofitInicializador() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public AlunoService getAlunoService() {
        return retrofit.create(AlunoService.class);
    }

}
