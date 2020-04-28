# 102. Binary Tree Level Order Traversal

BFS，但是要求分层，所以Solution1干脆把队列分成两个，交替进行搜索，也就能把不同的层分开了。

Solution2是做了一个独特的markElement，作为两个层之间的分隔符而存在。一开始是想把null作为分隔符，但是这不太合适。
