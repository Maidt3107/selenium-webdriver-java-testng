package javaTester;

public class Topic_01_And_Or {

	public static void main(String[] args) {
		//có 2 điều kiện 
		// kết hợp and hoặc or giữa 2 điều kiện này
		// ra kết quả (True/ False)
		boolean firstCondition = true;
		boolean secondCondition = false;
		boolean reasult;
		// AND : Nếu 1 trong 2 điều kiện sai = sai
		// chỉ khi nào cả 2 đều đúng = đúng 
		// ĐK 1 =     TRUE     FALSE    FALSE     TRUE
		//ĐK 2 =      FALSE    TRUE     FALSE     TRUE 
		// Reasult =  FALSE    FALSE    FALSE     TRUE
		firstCondition = true;
		secondCondition = false;
		System.out.println(firstCondition && secondCondition);
		
		firstCondition = false;
		secondCondition = true;
		System.out.println(firstCondition && secondCondition);
		
		firstCondition = false;
		secondCondition = false;
		System.out.println(firstCondition && secondCondition);
		
		firstCondition = true;
		secondCondition = true;
		System.out.println(firstCondition && secondCondition);
		
		// OR : Nếu 1 trong 2 điều kiện đúng = đúng
				// ĐK 1 =     TRUE     FALSE    FALSE     TRUE
				//ĐK 2 =      FALSE    TRUE     FALSE     TRUE 
				// Reasult =  TRUE    TRUE    FALSE     TRUE
		firstCondition = true;
		secondCondition = false;
		System.out.println(firstCondition || secondCondition);
		
		firstCondition = false;
		secondCondition = true;
		System.out.println(firstCondition || secondCondition);
		
		firstCondition = false;
		secondCondition = false;
		System.out.println(firstCondition || secondCondition);
		
		firstCondition = true;
		secondCondition = true;
		System.out.println(firstCondition || secondCondition);
		
		

	}

}
