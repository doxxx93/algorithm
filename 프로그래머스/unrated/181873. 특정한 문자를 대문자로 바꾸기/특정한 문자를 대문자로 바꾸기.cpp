#include <string>
#include <vector>

using namespace std;

string solution(string my_string, string alp) {
    for (int i = 0; i < my_string.size(); i++) {
        if (my_string[i] == alp[0]) {
            my_string[i] = toupper(alp[0]);
        }
    }
    return my_string;
}