package com.astro.daily;
public class Shukr extends Grah {
	String karakatva[] = {"Patni", "Vaibhav", "Dampatyasukh"};
	int shubhGochar[] = {1,2,3,4,5,8,9,11,12};
	int ashubhGochar[] = {6,7,10};
	int mulTrikon = 7;
	int shubhVedh[] = {1,3,5,6,7,8,9,10,11};
	int ashubhVedh[] = {2,4,12};

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
