
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

        mp = {}

        for ele in nums:
            mp[ele] = mp.get(ele, 0) + 1

        count = [[] for i in range(len(nums) + 1)]

        for key, val in mp.items():
            count[val].append(key)

        ans = []

        for i in range(len(count) - 1, -1, -1):
            for ele in count[i]:
                ans.append(ele)
                k -= 1

                if k == 0:
                    return ans
