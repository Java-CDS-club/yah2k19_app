package com.example.bottomnavacm;

import android.app.Application;

public class Food_user extends Application {

    public static String user_f;
    public static String number;
    static String [] food_names = new String[]{"Snack1","Dinner","Snack2","Breakfast","Lunch2","Snack3"};

    public Food_user(String username, String number) {
        this.user_f = username;
        this.number = number;
    }

    /*//  public Food_user(String username) {

     // }
      //  public String pass_f;

     public String getName(){
         return user_f;
     }
     public void setName(String username){
         user_f = username;
     }
      public String getNum(){
          return number;
      }
      public void setNum(String num){
          number = num;
      }
  */
  /*public void Food_user(String username,String num)
  {

  }*/

}

