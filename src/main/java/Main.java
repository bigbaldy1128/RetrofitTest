import com.google.gson.Gson;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

/**
 * Created by wangjinzhao on 2016/11/30.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://127.0.0.1:5555")
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();

        MyService service = retrofit.create(MyService.class);
        System.out.println(service.add(1,15).execute().body());
    }
}
