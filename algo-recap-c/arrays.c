#include <stdio.h>

int ** getPairs(int nums[], int len, long sum) {
	for (int i = 0; i < len; ++i)
	{
		for (int j = i + 1; j < len; ++j)
		{
			if (nums[i] + nums[j] == sum) {
				printf("%d + %d = %d\n", nums[i], nums[j], sum);
			}
		}
	}
	return NULL;
}

void swap(char * a, char * b) {
	char temp = *a;
	*a = *b;
	*b = temp;
}

// inplace
void reverseString(char * string, int len) {
	char * front = string;
	char * back = &string[len-2]; // don't want the terminator
	while (front < back) {
		swap(front++, back--);
	}
}

int main(int argc, char const *argv[])
{
	// int t[] = {1, 1, 2, 4, 5, 8, -3, 7, 9, 6, 4, 1, 8, 7, 928};
	// getPairs(t, sizeof(t)/sizeof(t[0]), 929);

	char temp[] = "Ana voli Milovana.";
	reverseString(temp, sizeof(temp)/sizeof(temp[0]));
	printf("Reversed: %s\n", temp);

	return 0;
}