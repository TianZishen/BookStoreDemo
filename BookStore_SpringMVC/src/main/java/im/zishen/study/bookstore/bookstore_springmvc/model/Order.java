package im.zishen.study.bookstore.bookstore_springmvc.model;


public class Order {
    private int id;
    private int[] booksId;
    private int userId;
    private String time;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getBooksId() {
        return booksId;
    }

    public void setBooksId(int[] booksId) {
        this.booksId = booksId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
