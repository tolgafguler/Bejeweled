import java.util.ArrayList;

public class D implements Jewels{
	 int point;
	 @Override
		public ArrayList<String[]> shifting(ArrayList<String[]> mapNew, int k, int l, int o, int p, int u, int y) {
			int i=0;
			int j=1;
			if(k-j>=0) {
			while(!mapNew.get(k-j)[l].equals(" ")) {
				if(k-i-1>=0) {
				mapNew.get(k-i)[l]=mapNew.get(k-i-1)[l];
				mapNew.get(k-i-1)[l]=" ";
				}
				else {
					break;
				}
				i++;
				j++;	
				if(k-j<0){
				break;
				}
			}
			}
			int q=0;
			int w=1;
			if(o-w>=0) {
			while(!mapNew.get(o-w)[p].equals(" ")) {
				if(o-q-1>=0) {
				mapNew.get(o-q)[p]=mapNew.get(o-q-1)[p];
				mapNew.get(o-q-1)[p]=" ";
				}
				else {
					break;
				}
				q++;
				w++;		
				if(o-w<0){
				break;
				}
			}
			}
			int m=0;
			int n=1;
			if(u-n>=0) {
			while(!mapNew.get(u-n)[y].equals(" ")) {
				if(u-m-1>=0) {
				mapNew.get(u-m)[y]=mapNew.get(u-m-1)[y];
				mapNew.get(u-m-1)[y]=" ";
				}
				else {
					break;
				}
				m++;
				n++;	
				if(u-n<0){
				break;
				}
			}
			}
			
			return mapNew;
		}

	@Override
	public ArrayList<String[]> deleting(ArrayList<String[]> map, int x, int y) {
		if((((x-1<=Main.rowCounter &&  y-1<=Main.columnCounter) && (x-1>=0 && y-1>=0)) && ((x-2<Main.rowCounter && y-2<Main.columnCounter) && (x-2>=0 && y-2>=0)))  && (map.get(x-1)[y-1].equals("D") && map.get(x-2)[y-2].equals("D"))) {       
				map.get(x)[y]=" ";
				map.get(x-1)[y-1]=" ";
				map.get(x-2)[y-2]=" ";
				this.point=90;
				map=shifting(map,x,y,x-1,y-1,x-2,y-2);
		}
		
		else if((((x+1<=Main.rowCounter &&  y+1<=Main.columnCounter) && (x+1>=0 && y+1>=0)) && ((x+2<Main.rowCounter && y+2<Main.columnCounter) && (x+2>=0 && y+2>=0)))  && (map.get(x+1)[y+1].equals("D") && map.get(x+2)[y+2].equals("D"))) {
				map.get(x)[y]=" ";
				map.get(x+1)[y+1]=" ";
				map.get(x+2)[y+2]=" ";
				this.point=90;
				map=shifting(map,x,y,x+1,y+1,x+2,y+2);
		}
		
		else if((((x-1<=Main.rowCounter &&  y+1<=Main.columnCounter) && (x-1>=0 && y+1>=0)) && ((x-2<Main.rowCounter && y+2<Main.columnCounter) && (x-2>=0 && y+2>=0)))  && (map.get(x-1)[y+1].equals("D") && map.get(x-2)[y+2].equals("D"))) {
	  			map.get(x)[y]=" ";
	  			map.get(x-1)[y+1]=" ";
	  			map.get(x-2)[y+2]=" ";
	  			this.point=90;
	  			map=shifting(map,x,y,x-1,y+1,x-2,y+2);
		}
		
		else if((((x+1<=Main.rowCounter &&  y-1<=Main.columnCounter) && (x+1>=0 && y-1>=0)) && ((x+2<Main.rowCounter && y-2<Main.columnCounter) && (x+2>=0 && y-2>=0)))  && (map.get(x+1)[y-1].equals("D") && map.get(x+2)[y-2].equals("D"))) {
	     		map.get(x)[y]=" ";
	     		map.get(x+1)[y-1]=" ";
	     		map.get(x+2)[y-2]=" ";
	     		this.point=90;
	     		map=shifting(map,x,y,x+1,y-1,x+2,y-2);
		}
		else {
			System.out.println("There is no matching");
			System.out.println();
		}
		
		return map;
	}



	





}
