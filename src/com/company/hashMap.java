//Implementation the operation with HashMap
package com.company;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        String s = "Before you can begin to determine what the a composition of a particular a a a a a a a a a aa a a a a a a a a paragraph will be, you must first decide on an argument and a working thesis statement for your paper. What is the most important idea that you are trying to convey to your reader? The information in each paragraph must be related to that idea. In other words, your paragraphs should remind your reader that there is a recurrent relationship between your thesis and the information in each paragraph. A working thesis functions like a seed from which your paper, and your ideas, will grow. The whole process is an organic one—a natural progression from a seed to a full-blown paper where there are direct, familial relationships between all of the ideas in the paper.The decision about what to put into your paragraphs begins with the germination of a seed of ideas; this “germination process” is better known as brainstorming. There are many techniques for brainstorming; whichever one you choose, this stage of paragraph development cannot be skipped. Building paragraphs can be like building a skyscraper: there must be a well-planned foundation that supports what you are building. Any cracks, inconsistencies, or other corruptions of the foundation can cause your whole paper to crumble.";
        String loweredString = s.toLowerCase();
        String[] Sta = loweredString.split("[ \\n\\t\\r.,  :;?!-()]");
        for (int i = 0; i < Sta.length; i++) {
            String word = Sta[i];
            //if : if word is already in the HashMap
            if (hashMap.containsKey(word)) {
                hashMap.put(word,(hashMap.get(word)+1));
            }// else : if word in newly putting in HashMap
            else{
              hashMap.put(word,1);
            }
        }//closing of for loop


        int max =0;
        String mostRepeatedWords = "";
        for (String key: hashMap.keySet())
        {

            int count;
            count = hashMap.get(key);
            if(count>max && key != null) {
                max = count;
                mostRepeatedWords = key;
            }
        }//closing of this for loop
        System.out.println("Word : '"+ mostRepeatedWords + "' exits " + max +" and the largest time in the paragraph");


    }
}
