package princ_5_dip.solucao;

public class Repo2 {

    private Db_Int db__Int;

    public Repo2(Db_Int db__Int)
    {
        this.db__Int = db__Int;
    }  

    public void AddUser(User user)
    {
        db__Int.ConnectDB();
        
        System.out.println("User added: " + user.getName());
    }

}
