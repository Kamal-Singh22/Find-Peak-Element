# Find-Peak-Element
A peak element is an element that is strictly greater than its neighbors.  Given a  0 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index of any of the peaks.
Explanation:
Binary Search Approach:

Start with two pointers: left at the beginning of the array and right at the end.
Calculate the middle index mid.
If nums[mid] > nums[mid + 1], then a peak lies in the left half (including mid).
Otherwise, a peak lies in the right half.
Continue this process until left == right. At this point, left points to the peak index.
Time Complexity:

The binary search ensures 
𝑂(log𝑛)O(logn) time complexity.
Space Complexity:
𝑂(1)O(1) as no extra space is used.
