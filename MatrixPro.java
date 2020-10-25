package ooplab;

public class MatrixPro {
	public static void main(String args[]) {
		int[][] A={{1,2,3},{4,5,6},{7,8,9}};
		int[][] B={{1,2,3},{4,5,6},{7,8,9}};
		int[][] pro={};
		int sum=0;
		int i,j,k;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				for(k=0;k<3;k++) {
					sum=sum+A[i][k]*B[k][j];
				}
				pro[i][j]=sum;
				sum=0;
			}
			
		}
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print(pro[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
