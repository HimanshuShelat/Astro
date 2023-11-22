package com.astro.daily;
public class Ketu extends Grah {
	String karakatva[] = {"maata", "man", "ras"};
	int shubhGochar[] = {0};
	int ashubhGochar[] = {0};
	int mulTrikon = 12;
	int shubhVedh[] = {0};
	int ashubhVedh[] = {0};

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
