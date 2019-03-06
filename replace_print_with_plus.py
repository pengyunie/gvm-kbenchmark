import sys
import re

filenames = sys.argv[1:]

for filename in filenames:
    with open(filename, "r") as f:
        content = f.read()
        # re_print_with_plus = re.compile(r"(?P<func>System\.out\.print(ln)?)\(\s*(?P<content>\"[^\"]*?\"|\([^\)]*?\)|[^'\"()+]+)\s*\+(?P<remain>.*?\);)", re.MULTILINE)
        re_print_with_plus = re.compile(r"(?P<func>System\.out\.print(ln)?)\(\s*(?P<content>'[^']*?'|\"[^\"]*?\"|\([^\)]*?\)|(\(\w+\))*[^'\"()\s;+][^'\"+;]*)\s*\+(?![+=])(?P<remain>[^;]*?\);)", re.MULTILINE)
        while re_print_with_plus.search(content):
            content = re_print_with_plus.sub(r"System.out.print(\g<content>); \g<func>(\g<remain>", content)
        # end while
    # end with

    with open(filename, "w") as f:
        f.write(content)
    # end with
# end for
