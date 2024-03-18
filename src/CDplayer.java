import java.util.*;
import java.io.*;
import java.lang.*;

public class CDplayer implements Comparator<CD> {

	ArrayList<CD> cds;
	
	public CDplayer(ArrayList<CD> cdsToAdd) {
		
		this.cds = cdsToAdd;
	}
	
	public void addCD(CD cds) {
		
		this.cds.add(cds);
	}
	
	public void addCD(ArrayList<CD> cds) {
		
		this.cds.addAll(cds);
	}
	
	public void removeCD(CD cds) {
		
		this.cds.remove(this.cds.indexOf(cds));   
	}
	
	public ArrayList<CD> getCD() {
		
		return cds;
	}
	
	public void reverseCD() {
		
		ArrayList<CD> cds = new ArrayList<CD>();
		
		for (int index = this.cds.size()-1; index > 0; index--) {
			
			cds.add(this.cds.get(index));
		}
	}
	
	public void sort() {
		int s = cds.size();
		for(int i = 0; i < s; i++) {
			for(int j = 0; j < s - i - 1; j++) {
				CD cd1 = cds.get(j);
				CD cd2 = cds.get(j + 1);
				
				if(compare(cd1, cd2) < 0) {
					cds.set(j+1, cd1);
					cds.set(j, cd2);
				}
			}
		}
	}
	@Override
	public int compare(CD x, CD y) {
		String n1 = x.getTitle();
		String n2 = y.getTitle();
		
		return n1.compareTo(n2);
	}

	
	
}
