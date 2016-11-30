import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by wangjinzhao on 2016/11/30.
 */
public interface MyService {
    @GET("add")
    Call<Integer> add(@Query("a") int a, @Query("b") int b);
}
