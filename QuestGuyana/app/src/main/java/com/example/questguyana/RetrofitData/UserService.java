package com.example.questguyana.RetrofitData;

import com.example.questguyana.Modelos.QuestResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface UserService {

    @FormUrlEncoded
    @POST("SendAnswers.php")
    Call<QuestResponse> SendAnswers (@Field("date_g") String date_g,
                                           @Field("time_g") String time_g,
                                           @Field("location") String location,
                                           @Field("question_1") String question_1,
                                           @Field("question_2") String question_2,
                                           @Field("question_3") String question_3,
                                           @Field("question_4") String question_4,
                                           @Field("question_5") String question_5,
                                           @Field("question_6") String question_6,
                                           @Field("question_7") String question_7,
                                           @Field("question_8") String question_8,
                                           @Field("question_9") String question_9,
                                           @Field("question_10") String question_10,
                                           @Field("question_11") String question_11,
                                           @Field("question_12") String question_12,
                                           @Field("question_13") String question_13);

}
