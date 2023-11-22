package com.astro.daily;
public class Budh extends Grah{
	String karakatva[] = {"maama", "vaani", "ganit"};
	int shubhGochar[] = {2,4,6,8,10,11};
	int ashubhGochar[] = {1,3,5,7,9,12};
	int mulTrikon = 6;
	int shubhVedh[] = {1,3,5,9,10,12};
	int ashubhVedh[] = {2,4,6,7,8,11};

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
