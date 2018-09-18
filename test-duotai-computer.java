
interface PCI{
	public abstract void connection();
	public abstract void close();
}

class MainBoard{
	void run(PCI p){
		p.connection();
		p.close();
	}
}

class NetCard implements PCI{
	public void connection(){
		MyUtil.println("网卡已连接");
	}

	public void close(){
		MyUtil.println("网卡已断开");
	}
}

class VideoCard implements PCI{
	public void connection(){
		MyUtil.println("显卡已连接");
	}

	public void close(){
		MyUtil.println("显卡断开");
	}
}

class TestComputer{
	public static void main(String[] args){
		MainBoard mb = new MainBoard();
		mb.run(new NetCard());
		mb.run(new VideoCard());

	}
}
