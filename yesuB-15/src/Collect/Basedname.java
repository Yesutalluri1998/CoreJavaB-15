package Collect;

import java.util.Comparator;

public class Basedname implements Comparator<Pedilite>{



	@Override
	public int compare(Pedilite o1, Pedilite o2) {
		 
		return o1.pname.compareTo(o2.pname);
	}

}
