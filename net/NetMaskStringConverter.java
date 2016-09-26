package net;
/**
* Naive implementation with String processing
**/
public class NetMaskStringConverter extends NetMaskConverter {

	public NetMaskStringConverter(String dotFormat){
		super(dotFormat);
	}


	/**
	* Get Slash formatted representation of the NetMask
	**/
	public int slashFormat(){
		StringBuilder b = new StringBuilder();
		for (String s: dotFormat.split("\\.")){
//			System.out.println("debug s: '" + s + "'");
			b.append(Integer.toBinaryString(Integer.parseUnsignedInt(s)));
		}
//		System.out.println("debug: '" + b + "'");
		return b.toString().replaceAll("0","").length();
	}

}