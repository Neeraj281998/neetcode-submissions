from collections import Counter
import heapq

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        count=Counter(nums)

        mainNums=[]
        result=[]

        for num,total in count.items():


            mainNums.append((-total,num))

        heapq.heapify(mainNums)

        for i in range(k):
            a,b=heapq.heappop(mainNums)
            result.append(b)
        
        return result

        

