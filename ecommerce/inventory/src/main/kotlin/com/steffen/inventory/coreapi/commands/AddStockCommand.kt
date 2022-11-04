package com.steffen.inventory.coreapi.commands

import org.axonframework.modelling.command.TargetAggregateIdentifier
import org.axonframework.serialization.Revision

@Revision("1")
data class AddStockCommand(

    @TargetAggregateIdentifier
    val productId: String,
    val amount: Int
)
