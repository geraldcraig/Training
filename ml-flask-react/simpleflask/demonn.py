import torch
import torch.nn as nn
import torch.nn.functional as F

class Net(nn.Module):

    def __init__(self):
        super(Net, self).__init__()

    def forward(self, x):
        return x


net = Net()
print(net)

torch.save(net, 'testnn.pt')

