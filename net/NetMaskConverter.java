package net;
/**
* Naive implementation with String processing
**/
abstract class NetMaskConverter implements NetMaskConverterI{

	final String dotFormat;

	NetMaskConverter(String dotFormat){
		this.dotFormat = dotFormat;
	}
}