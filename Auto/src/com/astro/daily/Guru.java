package com.astro.daily;
public class Guru extends Grah{
	String karakatva[] = {"pati", "santan", "charabi"};
	int shubhGochar[] = {2,5,7,9,11};
	int ashubhGochar[] = {1,3,4,6,8,10,12};
	int mulTrikon = 9;
	int shubhVedh[] = {3,4,8,10,12};
	int ashubhVedh[] = {1,2,5,6,7,9,11};

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
