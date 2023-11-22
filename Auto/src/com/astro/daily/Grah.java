package com.astro.daily;
public abstract class Grah {
	String karakatva[] = {"maata", "man", "ras"};
	//String mitraGrah[] = {"maata", "man", "ras"};
	//String shatruGrag[] = {"maata", "man", "ras"};
	int shubhGochar[] = {1,3,6,7,10,11};
	int ashubhGochar[] = {2,4,5,8,9,12};
	int mulTrikon = 2;
	int shubhVedh[] = {2,4,5,8,9,12};
	int ashubhVedh[] = {1,3,6,7,10,11};

		public String[] getKarakatva() {
			return this.karakatva;
		}
		public int[] getShubhGochar() {
			return this.shubhGochar;
		}
		public int[] getAshubhGochar() {
			return this.ashubhGochar;
		}
		public int getMulTrikon() {
			return this.mulTrikon;
		}
		public int[] getShubhVedh() {
			return this.shubhVedh;
		}
		public int[] getAshubhVedh() {
			return this.ashubhVedh;
		}
}
