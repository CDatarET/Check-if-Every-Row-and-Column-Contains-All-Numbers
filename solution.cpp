class Solution {
public:
    bool checkValid(vector<vector<int>>& matrix) {
        for(int i = 0; i < matrix.size(); i++){
            vector<int> count(matrix.size(), 0);
            for(int j = 0; j < matrix.size(); j++){
                if(matrix[i][j] > matrix.size()) return false;
                if(++count[matrix[i][j] - 1] == 2) return false;
            }
        }

        for(int i = 0; i < matrix.size(); i++){
            vector<int> count(matrix.size(), 0);
            for(int j = 0; j < matrix.size(); j++){
                if(matrix[j][i] > matrix.size()) return false;
                if(++count[matrix[j][i] - 1] == 2) return false;
            }
        }

        return true;
    }
};
