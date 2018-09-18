interface DbCusor{
	public abstract void connection();
}

interface DbOperate extends DbCusor{
	public abstract void add();
	public abstract void delete();
}



class ConnectionByJDBC implements DbCusor{
	public void connection(){
		MyUtil.println("以JDBC的方式连接数据库");
	}
	ConnectionByJDBC(){
		connection();
	}
}

class OperateByJDBC extends ConnectionByJDBC implements DbOperate{

	public void add(){
		MyUtil.println("使用JDBC的cusor进行add操作");
	}
	public void delete(){
		MyUtil.println("使用JDBC的cusor进行delete操作");
	}
}	

class NormalOperate{
	void function(DbOperate dbo){
		dbo.add();
		dbo.delete();
	}
}

class TestDatabase{
	public static void main(String[] args){
		NormalOperate a = new NormalOperate();
		a.function(new OperateByJDBC());
	}
}



