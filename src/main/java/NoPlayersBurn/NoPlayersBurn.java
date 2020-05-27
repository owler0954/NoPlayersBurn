package NoPlayersBurn;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.entities.type.*;
import mindustry.game.EventType.*;
import mindustry.ctype.UnlockableContent;
import mindustry.gen.*;
import mindustry.plugin.Plugin;
import mindustry.type.Item;
import mindustry.content.Items;
import mindustry.entities.type.*;
import arc.graphics.Color;


public class NoPlayersBurn extends Plugin{

    //register event handlers and create variables in the constructor
    public NoPlayersBurn(){
        //listen for a block selection event
        Events.on(WithdrawEvent.class, event -> {
            
            
            if(event.item.explosiveness > 0.2F||event.item.flammability==1.0F){
               

                event.player.clearItem();
                
            }
        });
    }

    
}

    

