class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(int i = 0 ; i < skill_trees.length ; i++){
            boolean isValid = true;
            char[] ckill = skill.toCharArray();
            char[] skills = skill_trees[i].toCharArray();
            int count = 0;
            for(int j = 0 ; j < skills.length ; j++){
                // System.out.print(String.valueOf(skills[j]));
                //스킬트리 순서가 있는 스킬이 왔을때
                if(skill.contains(String.valueOf(skills[j]))){
                    if(skills[j] == ckill[count]){
                        //순서가 지켜질 경우
                        count++;
                    }else{
                        //순서가 안지켜질 경우
                        isValid = false;
                    }
                }
               
            }
            System.out.println("");
            if(isValid == true){
                answer++;
            }

        }
        return answer;
    }
}
