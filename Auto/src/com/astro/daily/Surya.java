package com.astro.daily;
public class Surya extends Grah{
	String karakatva[] = {"pita", "atma", "raja"};
	int shubhGochar[] = {3,6,10,11};
	int ashubhGochar[] = {1,2,4,5,7,8,9,12};
	int mulTrikon = 5;
	int shubhVedh[] = {4,5,9,12};
	int ashubhVedh[] = {1,2,3,6,7,8,10,11};

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
