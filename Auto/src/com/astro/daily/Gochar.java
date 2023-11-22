package com.astro.daily;
import java.util.Scanner;
public class Gochar {
	int currentPos = 0;
	int jatakRaashi = 0;
	int jatakLagn = 0;
	boolean[] shubhGochar = {true,true,true,true,true,true,true,true,true,true}; //[0] is chanda, [1] is surya etc
	//boolean vedh = true;
	String[] raashi = {"Mesh", "Vrishabh", "Mithun", "Kark", "Sinh", "Kanya", "Tula", "Vrishchik", "Dhanu", "Makar", "Kumbh", "Meen"};
	int[] gocharGrahas = {1,2,3,4,5,6,7,8,9}; //[0] is chanda, [1] is surya etc
	int[] tempGocharGrahas = {1,2,3,4,5,6,7,8,9}; //[0] is chanda, [1] is surya etc
	String[] grahaNames = {"Chandra", "Surya", "Mangal", "Budh", "Guru", "Shukra", "Shani", "Rahu", "Ketu"};

boolean[] vedh = {false,false,false,false,false,false,false,false,false}; //if chandra vedh the vedh[0] true
int gocharGrahasVedhrelPos[] = {0,1,2,3,4,5,6,7,8}; //[0] is chanda, [1] is surya etc reuse for each graha to store rel position once vedh determined add value to vedh boolean for the grah.
int[] vedhGrah	= {1,2,3,4,5,6,7,8,9};
	public int grahaRelativePosition(int jatakRaashiLagna, int gocharGrahaPosition) {
		//this method returns position of graha from jatak raashi like raashi 4 grah in 7 so graha in 4rth position
		int grahaPositionFrom = 0;
		if (jatakRaashiLagna <= gocharGrahaPosition) {
			grahaPositionFrom = gocharGrahaPosition - jatakRaashiLagna + 1;
		} else {
			grahaPositionFrom = 12 - jatakRaashiLagna + gocharGrahaPosition + 1;
		}
		return grahaPositionFrom;
	}
	public void readGocharXls() {
		ReadData rd = new ReadData();
		int[] datas = rd.ReadXls();
		jatakRaashi = datas[0];
		jatakLagn = datas[1];
		for (int i = 2; i < 10 ; i++) {
			tempGocharGrahas[i-2] = datas[i];
		}
	}
	//method to get graha position number input from user
	public void getGocharGrahasInput() {
		int tempGrahaPosition = 0;
		for(int k = 0; k < tempGocharGrahas.length; k++) {
			//System.out.println("Gochar " + grahaNames[k] + " position: ");
			
			Scanner gocharGhaIn = new Scanner(System.in);
			String gocharGha = gocharGhaIn.nextLine();  // Read user input
			try {
				//System.out.println("Gochar " + grahaNames[k] + " is: "  + raashi[Integer.parseInt(gocharGha) - 1]);  // Output user input
				tempGrahaPosition = Integer.parseInt(gocharGha);  //remove -1
				tempGocharGrahas[k] = tempGrahaPosition;
			}
			catch(Exception e) {
				System.out.println( gocharGha + "Wrong data " + e);
			}
		}
		
	}
	public void matchGocharToTable(int grahaNum, int relPos) {
		boolean result = true;

		 	if(grahaNum == 0) {
		 		Chandra gra0 = new Chandra(); 
			 	for(int i = 0; i < gra0.getShubhGochar().length; i++) {
					//System.out.println("shubgochar element " + gra0.getShubhGochar()[i] + "    " + i + "     " + gocharGrahas[0]);
					if(relPos == gra0.getShubhGochar()[i]) {
						this.shubhGochar[0] = true;
						break;
					} else {
					this.shubhGochar[0] = false;
					} 
			 	}
		 	}
		 	if(grahaNum == 1) {
		 		Surya gra1 = new Surya(); 
			 	for(int i = 0; i < gra1.getShubhGochar().length; i++) {
					//System.out.println("shubgochar element " + gra1.getShubhGochar()[i] + "    " + i + "     " + gocharGrahas[1]);
					if(relPos == gra1.getShubhGochar()[i]) {
						this.shubhGochar[1] = true;
						break;
					} else {
					this.shubhGochar[1] = false;
					} 
					
	
			 	}
		 	}
		 	if(grahaNum == 2) {  
	        	Mangal gra2 = new Mangal(); 
			 	for(int i = 0; i < gra2.getShubhGochar().length; i++) {
					//System.out.println("shubgochar element " + gra2.getShubhGochar()[i] + "    " + i + "     " + gocharGrahas[2]);
					if(relPos == gra2.getShubhGochar()[i]) {
						this.shubhGochar[2] = true;
						break;
					} else {
					this.shubhGochar[2] = false;
					} 
					
			 	}
		 	}
		 	if(grahaNum == 3) {
		 		Budh gra3 = new Budh(); 
		        for(int i = 0; i < gra3.getShubhGochar().length; i++) {
					//System.out.println("shubgochar element " + gra3.getShubhGochar()[i] + "    " + i + "     " + gocharGrahas[3]);
					if(relPos == gra3.getShubhGochar()[i]) {
						this.shubhGochar[3] = true;
						break;
					} else {
					this.shubhGochar[3] = false;
					} 
			 	}
		 	}
		 	if(grahaNum == 4) {
		 		Guru gra4 = new Guru(); 
		        for(int i = 0; i < gra4.getShubhGochar().length; i++) {
					//System.out.println("shubgochar element " + gra4.getShubhGochar()[i] + "    " + i + "     " + gocharGrahas[4]);
					if(relPos == gra4.getShubhGochar()[i]) {
						this.shubhGochar[4] = true;
						break;
					} else {
					this.shubhGochar[4] = false;
					} 
			 	}
		 	}
		 	if(grahaNum == 5) {
		 		Shukr gra5 = new Shukr();
		        for(int i = 0; i < gra5.getShubhGochar().length; i++) {
					//System.out.println("shubgochar element " + gra5.getShubhGochar()[i] + "    " + i + "     " + gocharGrahas[5]);
					if(relPos == gra5.getShubhGochar()[i]) {
						this.shubhGochar[5] = true;
						break;
					} else {
					this.shubhGochar[5] = false;
					} 
					//System.out.println("shubgochar element ****************" + i);
			 	}
		 	}
		 	if(grahaNum == 6) {
		 		Shani gra6 = new Shani();
		        for(int i = 0; i < gra6.getShubhGochar().length; i++) {
					//System.out.println("shubgochar element " + gra6.getShubhGochar()[i] + "    " + i + "     " + gocharGrahas[6]);
					if(relPos == gra6.getShubhGochar()[i]) {
						this.shubhGochar[6] = true;
						break;
					} else {
					this.shubhGochar[6] = false;
					} 
			 	}
		 	}
		 	if(grahaNum == 7) {
		 		Rahu gra7 = new Rahu(); 
			        for(int i = 0; i < gra7.getShubhGochar().length; i++) {
						//System.out.println("shubgochar element " + gra7.getShubhGochar()[i] + "    " + i + "     " + gocharGrahas[7]);
						if(relPos == gra7.getShubhGochar()[i]) {
							this.shubhGochar[7] = true;
							break;
						} else {
						this.shubhGochar[7] = false;
						} 
				 	}
		 	}
		 	if(grahaNum == 8) {
		 		Ketu gra8 = new Ketu(); 
			        for(int i = 0; i < gra8.getShubhGochar().length; i++) {
						//System.out.println("shubgochar element " + gra8.getShubhGochar()[i] + "    " + i + "     " + gocharGrahas[8]);
						if(relPos == gra8.getShubhGochar()[i]) {
							this.shubhGochar[8] = true;
							break;
						} else {
						this.shubhGochar[8] = false;
						} 
				 	}
		 	}

	}
	public void countVedh() {
		int tempPos[] = {0,1,2,3,4,5,6,7,8};
		for(int i = 0; i < tempGocharGrahas.length; i++) {
			if(i ==0) {  //find vedh for chandra that is 0
				for(int j = 0; j < tempGocharGrahas.length; j++) {
					if (vedh[0]) break;
					if (j == 0) continue; //do not check vedh for chandra in gochar from chandra in gochar. do this for each grah
					tempPos[j] = grahaRelativePosition(i, j);
					
				 		Chandra gra0 = new Chandra(); 
						if(shubhGochar[0]){
							for(int k = 0; k < gra0.getShubhVedh().length; k++) {
								//System.out.println("shubgochar element " + gra0.getShubhGochar()[k] + "    " + k + "     " + gocharGrahas[0]);
								if(tempPos[j] == gra0.getShubhVedh()[k]) {
									this.vedh[0] = true;
									break;
									
								} else {
								this.vedh[0] = false;
								} 
							}
						} else {
							for(int k = 0; k < gra0.getAshubhVedh().length; k++) {
								//System.out.println("shubgochar element " + gra0.getShubhGochar()[k] + "    " + k + "     " + gocharGrahas[0]);
								if(tempPos[j] == gra0.getAshubhVedh()[k]) {
									this.vedh[0] = true;
									break;
								} else {
								this.vedh[0] = false;
								} 
							}
						}	
				}
			
			} else if(i ==1) {  //find vedh for chandra that is 0
				for(int j = 0; j < tempGocharGrahas.length; j++) {
					if (vedh[1]) break;
					if (j == 1) continue; //do not check vedh for chandra in gochar from chandra in gochar. do this for each grah
					tempPos[j] = grahaRelativePosition(i, j);
					
				 		Surya gra1 = new Surya(); 
						if(shubhGochar[1]){
							for(int k = 0; k < gra1.getShubhVedh().length; k++) {
								//System.out.println("shubgochar element " + gra0.getShubhGochar()[k] + "    " + k + "     " + gocharGrahas[0]);
								if(tempPos[j] == gra1.getShubhVedh()[k]) {
									this.vedh[1] = true;
									break;
									
								} else {
								this.vedh[1] = false;
								} 
							}
						} else {
							for(int k = 0; k < gra1.getAshubhVedh().length; k++) {
								//System.out.println("shubgochar element " + gra0.getShubhGochar()[k] + "    " + k + "     " + gocharGrahas[0]);
								if(tempPos[j] == gra1.getAshubhVedh()[k]) {
									this.vedh[1] = true;
									break;
								} else {
								this.vedh[1] = false;
								} 
							}
						}	
				}
			
			} else if(i ==2) {  //find vedh for Mangal that is 0
				for(int j = 0; j < tempGocharGrahas.length; j++) {
					if (vedh[2]) break;
					if (j == 2) continue; //do not check vedh for Mangal in gochar from Mangal in gochar. do this for each grah
					tempPos[j] = grahaRelativePosition(i, j);
					
				 		Mangal gra1 = new Mangal(); 
						if(shubhGochar[2]){
							for(int k = 0; k < gra1.getShubhVedh().length; k++) {
								//System.out.println("shubgochar element " + gra0.getShubhGochar()[k] + "    " + k + "     " + gocharGrahas[0]);
								if(tempPos[j] == gra1.getShubhVedh()[k]) {
									this.vedh[2] = true;
									break;
									
								} else {
								this.vedh[2] = false;
								} 
							}
						} else {
							for(int k = 0; k < gra1.getAshubhVedh().length; k++) {
								//System.out.println("shubgochar element " + gra0.getShubhGochar()[k] + "    " + k + "     " + gocharGrahas[0]);
								if(tempPos[j] == gra1.getAshubhVedh()[k]) {
									this.vedh[2] = true;
									break;
								} else {
								this.vedh[2] = false;
								} 
							}
						}	
				}
			
			} else if(i ==3) {  //find vedh for Budh that is 0
				for(int j = 0; j < tempGocharGrahas.length; j++) {
					if (vedh[3]) break;
					if (j == 3) continue; //do not check vedh for Budh in gochar from Budh in gochar. do this for each grah
					tempPos[j] = grahaRelativePosition(i, j);
					
				 		Budh gra1 = new Budh(); 
						if(shubhGochar[3]){
							for(int k = 0; k < gra1.getShubhVedh().length; k++) {
								//System.out.println("shubgochar element " + gra0.getShubhGochar()[k] + "    " + k + "     " + gocharGrahas[0]);
								if(tempPos[j] == gra1.getShubhVedh()[k]) {
									this.vedh[3] = true;
									break;
									
								} else {
								this.vedh[3] = false;
								} 
							}
						} else {
							for(int k = 0; k < gra1.getAshubhVedh().length; k++) {
								//System.out.println("shubgochar element " + gra0.getShubhGochar()[k] + "    " + k + "     " + gocharGrahas[0]);
								if(tempPos[j] == gra1.getAshubhVedh()[k]) {
									this.vedh[3] = true;
									break;
								} else {
								this.vedh[3] = false;
								} 
							}
						}	
				}
			
			} else if(i ==4) {  //find vedh for Guru that is 0
				for(int j = 0; j < tempGocharGrahas.length; j++) {
					if (vedh[4]) break;
					if (j == 4) continue; //do not check vedh for Guru in gochar from Guru in gochar. do this for each grah
					tempPos[j] = grahaRelativePosition(i, j);
					
				 		Guru gra1 = new Guru(); 
						if(shubhGochar[4]){
							for(int k = 0; k < gra1.getShubhVedh().length; k++) {
								//System.out.println("shubgochar element " + gra0.getShubhGochar()[k] + "    " + k + "     " + gocharGrahas[0]);
								if(tempPos[j] == gra1.getShubhVedh()[k]) {
									this.vedh[4] = true;
									break;
									
								} else {
								this.vedh[4] = false;
								} 
							}
						} else {
							for(int k = 0; k < gra1.getAshubhVedh().length; k++) {
								//System.out.println("shubgochar element " + gra0.getShubhGochar()[k] + "    " + k + "     " + gocharGrahas[0]);
								if(tempPos[j] == gra1.getAshubhVedh()[k]) {
									this.vedh[4] = true;
									break;
								} else {
								this.vedh[4] = false;
								} 
							}
						}	
				}
			
			} else if(i ==5) {  //find vedh for Shukr that is 0
				for(int j = 0; j < tempGocharGrahas.length; j++) {
					if (vedh[5]) break;
					if (j == 5) continue; //do not check vedh for Shukr in gochar from Shukr in gochar. do this for each grah
					tempPos[j] = grahaRelativePosition(i, j);
					
				 		Shukr gra1 = new Shukr(); 
						if(shubhGochar[5]){
							for(int k = 0; k < gra1.getShubhVedh().length; k++) {
								//System.out.println("shubgochar element " + gra0.getShubhGochar()[k] + "    " + k + "     " + gocharGrahas[0]);
								if(tempPos[j] == gra1.getShubhVedh()[k]) {
									this.vedh[5] = true;
									break;
									
								} else {
								this.vedh[5] = false;
								} 
							}
						} else {
							for(int k = 0; k < gra1.getAshubhVedh().length; k++) {
								//System.out.println("shubgochar element " + gra0.getShubhGochar()[k] + "    " + k + "     " + gocharGrahas[0]);
								if(tempPos[j] == gra1.getAshubhVedh()[k]) {
									this.vedh[5] = true;
									break;
								} else {
								this.vedh[5] = false;
								} 
							}
						}	
				}
			
			} else if(i ==6) {  //find vedh for Shani that is 0
				for(int j = 0; j < tempGocharGrahas.length; j++) {
					if (vedh[6]) break;
					if (j == 6) continue; //do not check vedh for Shani in gochar from Shani in gochar. do this for each grah
					tempPos[j] = grahaRelativePosition(i, j);
					
				 		Shani gra1 = new Shani(); 
						if(shubhGochar[6]){
							for(int k = 0; k < gra1.getShubhVedh().length; k++) {
								//System.out.println("shubgochar element " + gra0.getShubhGochar()[k] + "    " + k + "     " + gocharGrahas[0]);
								if(tempPos[j] == gra1.getShubhVedh()[k]) {
									this.vedh[6] = true;
									break;
									
								} else {
								this.vedh[6] = false;
								} 
							}
						} else {
							for(int k = 0; k < gra1.getAshubhVedh().length; k++) {
								//System.out.println("shubgochar element " + gra0.getShubhGochar()[k] + "    " + k + "     " + gocharGrahas[0]);
								if(tempPos[j] == gra1.getAshubhVedh()[k]) {
									this.vedh[6] = true;
									break;
								} else {
								this.vedh[6] = false;
								} 
							}
						}	
				}
			
			} else if(i ==7) {  //find vedh for Rahu that is 0
				for(int j = 0; j < tempGocharGrahas.length; j++) {
					if (vedh[7]) break;
					if (j == 7) continue; //do not check vedh for Rahu in gochar from Rahu in gochar. do this for each grah
					tempPos[j] = grahaRelativePosition(i, j);
					
				 		Rahu gra1 = new Rahu(); 
						if(shubhGochar[7]){
							for(int k = 0; k < gra1.getShubhVedh().length; k++) {
								//System.out.println("shubgochar element " + gra0.getShubhGochar()[k] + "    " + k + "     " + gocharGrahas[0]);
								if(tempPos[j] == gra1.getShubhVedh()[k]) {
									this.vedh[7] = true;
									break;
									
								} else {
								this.vedh[7] = false;
								} 
							}
						} else {
							for(int k = 0; k < gra1.getAshubhVedh().length; k++) {
								//System.out.println("shubgochar element " + gra0.getShubhGochar()[k] + "    " + k + "     " + gocharGrahas[0]);
								if(tempPos[j] == gra1.getAshubhVedh()[k]) {
									this.vedh[7] = true;
									break;
								} else {
								this.vedh[7] = false;
								} 
							}
						}	
				}
			
			} else if(i ==8) {  //find vedh for Ketu that is 0
				for(int j = 0; j < tempGocharGrahas.length; j++) {
					if (vedh[8]) break;
					if (j == 8) continue; //do not check vedh for Ketu in gochar from Ketu in gochar. do this for each grah
					tempPos[j] = grahaRelativePosition(i, j);
					
				 		Ketu gra1 = new Ketu(); 
						if(shubhGochar[8]){
							for(int k = 0; k < gra1.getShubhVedh().length; k++) {
								//System.out.println("shubgochar element " + gra0.getShubhGochar()[k] + "    " + k + "     " + gocharGrahas[0]);
								if(tempPos[j] == gra1.getShubhVedh()[k]) {
									this.vedh[8] = true;
									break;
									
								} else {
								this.vedh[8] = false;
								} 
							}
						} else {
							for(int k = 0; k < gra1.getAshubhVedh().length; k++) {
								//System.out.println("shubgochar element " + gra0.getShubhGochar()[k] + "    " + k + "     " + gocharGrahas[0]);
								if(tempPos[j] == gra1.getAshubhVedh()[k]) {
									this.vedh[8] = true;
									break;
								} else {
								this.vedh[8] = false;
								} 
							}
						}	
				}
			
			}
			
		}
	}
	
	public static void main(String[] args) {
		Gochar now = new Gochar();

		now.readGocharXls();
		System.out.println("#####From Raashi#####");
		for(int i=0; i< now.gocharGrahas.length; i++) {
		
			//Convert gochar chandra position to relative to jatak chandra like kark thi chothe if in tula
			now.gocharGrahas[i] = now.grahaRelativePosition(now.jatakRaashi, now.tempGocharGrahas[i]);
			//match gochar chanda with shubh gochar for chandra from Chandra class  shubhGochar array
			now.matchGocharToTable(i, now.gocharGrahas[i]);
		
		}
		now.countVedh();
		for(int i=0; i < now.grahaNames.length; i++)
			System.out.println( now.grahaNames[i] + " gochar shub? " + "\t" + now.shubhGochar[i] + "\t" + "  vedh? : " + "\t" + now.vedh[i]); 
		//count from lagn
		System.out.println("#####From Lagna#####");
		for(int i=0; i< now.gocharGrahas.length; i++) {
			
			//Convert gochar chandra position to relative to jatak chandra like kark thi chothe if in tula
			now.gocharGrahas[i] = now.grahaRelativePosition(now.jatakLagn, now.tempGocharGrahas[i]);
			//match gochar chanda with shubh gochar for chandra from Chandra class  shubhGochar array
			now.matchGocharToTable(i, now.gocharGrahas[i]);
		
		}
		now.countVedh();
		for(int i=0; i < now.grahaNames.length; i++)
			System.out.println( now.grahaNames[i] + " gochar shub? " + "\t" + now.shubhGochar[i] + "\t" + "  vedh? : " + "\t" + now.vedh[i]); 

	}
}
