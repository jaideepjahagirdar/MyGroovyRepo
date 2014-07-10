def current = 1
def next = 1
def fibonacci = {
 for(int i=0; i<5; i++){
 println current + ''
 sum = current + next
 current = next
 next = sum
}
}
fibonacci()
