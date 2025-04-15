#include <algorithm>
#include <iostream>
#include <limits.h> // For INT_MAX
#include <time.h>   // For time measurement
#include <vector>

using namespace std;

int recursive(int k, int n); // Function prototype for recursive method
int DP(int k, int n);        // Function prototype for DP method
int main() {
    int k, n, t;
    cin >> t;
    for (int i = 0; i < t; i++) {
        cin >> k >> n;            // k: number of objects, n: number of meters
        cout << DP(k, n) << endl; // Call the DP function and print the result
    }
    return 0;
}

int DP(int k, int n) {                                          // DP Table: dp[i][j] represents minimum attempts for i objects and j meters
    vector<vector<int>> dp(k + 1, vector<int>(n + 1, INT_MAX)); // Initialize DP table with INT_MAX
    int b, s;                                                   // b: break, s: survive
    // base cases
    for (int i = 1; i <= k; i++) { // Objects
        dp[i][0] = 0;              // 0 meters, 0 attempts needed
        dp[i][1] = 1;              // 1 meter, 1 attempt needed
    }
    for (int j = 1; j <= n; j++) { // Meters
        dp[1][j] = j;              // 1 object, need to try all heights
    }
    // Fill the DP table
    for (int i = 2; i <= k; i++) {     // Objects
        for (int j = 2; j <= n; j++) { // Meters
                                       // Try dropping from every height X (1 to j)
            for (int x = 1; x <= j; x++) {
                // case 1: when object breaks, b = dp[.....][.....];
                b = dp[i - 1][x - 1]; // drop from height x, if it breaks, check below
                                      // case 2: when object survives, s = dp[.....][.....];
                s = dp[i][j - x];     // drop from height x, if it survives, check above
                int worst = 1 + max(b, s);
                dp[i][j] = min(dp[i][j], worst); // Take minimum over all trials
            }
        } // end of for x
    } // end of for j } // end of for i
    return dp[k][n]; // Return the minimum attempts needed
};