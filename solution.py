class Solution:
    def checkValid(self, matrix: list[list[int]]) -> bool:
        for i in range(len(matrix)):
            count = [0] * len(matrix)
            for j in range(len(matrix)):
                if matrix[i][j] > len(matrix):
                    return False

                count[matrix[i][j] - 1] += 1
                if count[matrix[i][j] - 1] == 2:
                    return False
        
        for i in range(len(matrix)):
            count = [0] * len(matrix)
            for j in range(len(matrix)):
                if matrix[j][i] > len(matrix):
                    return False

                count[matrix[j][i] - 1] += 1
                if count[matrix[j][i] - 1] == 2:
                    return False
    
        return True
