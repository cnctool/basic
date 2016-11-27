# CnC Tool v0.1

This Tool calculates Toolpahes for Pre-Milling angled Surfaces.
Let me give u an easy example of how this works:

Lets imagine u got a Block of Aluminium 200x200x200 (MM or Inch or what ever u wish).
And u have to make a Angled Surface 100x100 (45° Degrees)

For 45 Degrees this is pretty easy to do with in ur Head:                                                                    
For every Milimeter or inch u move away from Y100 u can go down maximum 1 Milimeter or Inch.
Otherwise u will cut to deep and ur Angled Surface got Scratches all over it.

Example for a 60mm Head:
                                                                                                            
G0 x-50 y-50                                                                                                
z50                                                                                             
z10                                                                                                  
g1 g42 y90 z-9.5 f8000    <- See how we just went z-9.5  only                                                                                        
x250                                                                                                      
g0 z10                                                                                                                  
g40 z50

and so on...

We will see where this project will take us :D
