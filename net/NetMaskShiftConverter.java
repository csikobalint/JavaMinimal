package net;
import java.util.BitSet;
public class NetMaskShiftConverter extends NetMaskConverter{

	public NetMaskShiftConverter(String dotFormat){
		super(dotFormat);
	}
	
	public int slashFormat(){
		long[] l = new long[4];
		int i = 0;
		for (String s : dotFormat.split("\\.")){
			l[i++] = Long.parseLong(s);
		}
		int c = BitSet.valueOf(l).cardinality();
//		System.out.println("c" + c);
		return c;
	}
}