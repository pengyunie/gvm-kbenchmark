#!/bin/bash

# Only execute once (on commit
# 675b60f5f15ffe06755c81821258c1c256c8dc5b) to transform print
# statement with additions to separate print statements. Not
# guaranteed to work for all cases!!!
#
# Need to manually correct these cases after the script:
# 09_exp_type-exp_type_15_int_add
# 09_exp_type-exp_type_29_composite_exp
#
# find -name *.java -type f | xargs python3 replace_print_with_plus.py
