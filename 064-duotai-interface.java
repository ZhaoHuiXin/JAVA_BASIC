
class User{
	String name;
	User(String name){
		this.name = name;
	}
}

interface DBConnector{
	public abstract void add(User u);
	public abstract void delete(User u);
}

class UserDBOperate{
	void run(DBConnector db, User u){
		db.add(u);
		db.delete(u);
	}
}

class JDBC implements DBConnector{
	public void add(User u){
		System.out.println("add user "+ u.name +" by JDBC");
	}
	public void delete(User u){
		System.out.println("delete user "+ u.name +" by JDBC");
	}
}

class Balabala implements DBConnector{
	public void add(User u){
		System.out.println("add user "+ u.name +" by Balabala");
	}
	public void delete(User u){
		System.out.println("delete user "+ u.name +" by Balabala");
	}
}

class DuoTaiInterface2{
	public static void main(String[] args){
		User u = new User("马云");
		UserDBOperate udbo = new UserDBOperate();
		udbo.run(new JDBC(),u);
		udbo.run(new Balabala(),u);
	}
}