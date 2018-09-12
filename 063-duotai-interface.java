/*
	需求：
	电脑运行实例
	电脑运行基于主板
*/
interface PCI{
	public abstract void pciOpen();
	public abstract void pciClose();
}

class MainBoard{
	void run(PCI p){
		p.pciOpen();
		p.pciClose();
	}
}

class ViewCard implements PCI{
	public void pciOpen(){
		System.out.println("ViewCard open");
	}

	public void pciClose(){
		System.out.println("ViewCard close");
	}
}

class SoundCard implements PCI{
	public void pciOpen(){
		System.out.println("SoundCard open");
	}

	public void pciClose(){
		System.out.println("SoundCard close");
	}
}

class DuoTaiInterface{
	public static void main(String[] args){
		MainBoard m = new MainBoard();
		m.run(new ViewCard());
		m.run(new SoundCard());
	}
}