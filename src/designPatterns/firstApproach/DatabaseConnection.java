package designPatterns.firstApproach;

public class DatabaseConnection {
    private static DatabaseConnection dbc = null;
    private int num;
    private DatabaseConnection(){

    }

    public static DatabaseConnection getInstance() {
        if (dbc == null)
        {
            dbc = new DatabaseConnection();
        }
        return dbc;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
