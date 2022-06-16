package Diarypackage.model;

public class User {
      private String name;
      private String password;
      private DiaryForUsers diary;


      public User(String name, String password){
            this.name = name;
            this.password = password;
            diary = new DiaryForUsers(password, name);
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }


      public String getDiary() {
            return diary.toString();
      }

      public String getPassword() {
            return password;
      }

      public void setPassword(String password) {
            this.password = password;
      }

      public void setDiary(DiaryForUsers userDiary) {
            diary = userDiary;
      }
}
