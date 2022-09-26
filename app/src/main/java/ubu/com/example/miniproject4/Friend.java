package ubu.com.example.miniproject4;

public class Friend {
    String Friend_Name;
    String url;
    public Friend(){

    }

    public Friend(String friend_Name, String url) {
        this.Friend_Name = friend_Name;
        this.url = url;
    }
    public String getFriend_Name() {
        return Friend_Name;
    }

    public void setFriend_Name(String friend_Name) {
        Friend_Name = friend_Name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
