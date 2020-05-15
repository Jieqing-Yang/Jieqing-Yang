package ex01;

import java.io.IOException;
import java.io.OutputStream;

public class KVPOutputStream extends OutputStream 
{

//alle keys bekommen
keys=key.keys()
print(keys)
print(type (keys))
//alle keys entnehmen
for key in keys:
     print(key)
  
    value=key[key]
    print('%s:%s'%(key,value))
//alle value bekommen
values=value.values()
# print(values)
print('------------------')
//alle value entnehmen
for value in values:
    print(value)

//alle KV bekommen
items=KV.items()
#[('phone', 110), ('sex', '男')]
# print(items)
for item in items:
    # print(item)

    key=item[0]
    value=item[1]
    print('键：%s值：%s'%(key,value))

	@Override
	public void write(int arg0) throws IOException 
	{
		// Kann ignoriert werden

	}

}
