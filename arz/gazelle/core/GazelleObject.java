package arz.gazelle.core;

public abstract class GazelleObject
{
	public abstract Status switchMessage(int code, int val);
	public abstract Status switchMessage(int code, String val);
}
