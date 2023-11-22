package com.astro.daily;
public class Shani extends Grah {
	String karakatva[] = {"Sevak", "Sahanshilata", "Ayushya"};
	int shubhGochar[] = {3,6,11};
	int ashubhGochar[] = {1,2,4,5,7,8,9,10,12};
	int mulTrikon = 11;
	int shubhVedh[] = {5,9,12};
	int ashubhVedh[] = {1,2,3,4,6,7,8,10,11};

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
