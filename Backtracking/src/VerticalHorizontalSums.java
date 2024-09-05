/*Given a matrix B, of size N x M,
 you are allowed to do at most A special operations on this grid
 such that there is no vertical or horizontal contiguous subarray
 that has a sum greater than C.

A special operation involves multiplying any element by -1 i.e.
changing its sign.

Return 1 if it is possible to achieve the answer, otherwise 0.

Input 1:

 A = 3
 B = [
        [1, 1, 1]
        [1, 1, 1]
        [1, 1, 1]
     ]
 C = 2

 ans -> 1

 The given matrix does not satisfy the conditions,
 but if we apply the special operation to B[0][0], B[1][1], B[2][2],
 then the matrix would satisfy the given conditions
  i.e. no row or column has a sum greater than 2.

Input 2:

 A = 1
 B = [
        [1, 1, 1]
        [1, 1, 1]
        [1, 1, 1]
     ]
 C = 2


Explanation 2:

 It is not possible to apply the special operation to 1 element to
 satisfy the conditions.

* */
public class VerticalHorizontalSums {
    public static void main(String[] args) {

    }
}
