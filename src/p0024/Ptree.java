package p0024;
/**
 * permutation tree
 * @author Administrator
 *
 */
public class Ptree {

	 private String root = "";
	 private String sub =  "";
	 private int offset = 0;

	 public Ptree(String subroot, String subElem, int offset )	{
		 
		 this.root = subroot;
		 this.sub = subElem;
		 this.offset = offset;
		 
	 }

	public int countPermutation() {
		return factorial(sub.length());
	}

	private int factorial(int n) {
		
		if(n==1)
			return 1; 
		
		return n * factorial(n-1) ;
	}
	
	public Ptree getSubTree(int idx) {
		// sub1 ( root = "1", sub="023", offset=6 )
		// sub10 ( root="0", sub="23",  offset=6)
		
		String subRoot = this.root + sub.charAt(idx);
		String subElem = sub.substring(0,idx) + sub.substring(idx+1);
		
        int subOffset = this.offset + idx * factorial(sub.length()-1);
		
		return new Ptree(subRoot, subElem, subOffset);
	}


	public String getRootString() {
		return this.root;
	}

	public int getOffset() {
		return this.offset;
	}

	public String getElemString() {
		return sub;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + offset;
		result = prime * result + ((root == null) ? 0 : root.hashCode());
		result = prime * result + ((sub == null) ? 0 : sub.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ptree other = (Ptree) obj;
		if (offset != other.offset)
			return false;
		if (root == null) {
			if (other.root != null)
				return false;
		} else if (!root.equals(other.root))
			return false;
		if (sub == null) {
			if (other.sub != null)
				return false;
		} else if (!sub.equals(other.sub))
			return false;
		return true;
	}
	

	/*@Override
	public String toString() {
		return "Ptree [root=" + root + ", sub=" + sub + ", offset=" + offset
				+ "]";
	}*/
	public int countChild() {
		return sub.length();
	}
	

	@Override
	public String toString() {
		return "Ptree [root=" + root + ", sub=" + sub + ", offset=" + offset
				+ "]";
	} 
	
	

}
