/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayDayoNeee;

/**
 *
 * @author Night's Watch
 */
public class arrayOperationSkuld {
	public static void main(String[] args){
		int[][] nilai = {{10,12},{11,14}};

		for (int i = 0; i < nilai.length; i++) {
			for (int j = 0; j < nilai[i].length; j++) {
				System.out.print(nilai[i][j]+"\t");
			}
			System.out.println();
		}

	}
}