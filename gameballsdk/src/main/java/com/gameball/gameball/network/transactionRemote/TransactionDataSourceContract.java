package com.gameball.gameball.network.transactionRemote;

import com.gameball.gameball.model.request.HoldPointBody;
import com.gameball.gameball.model.request.PointTransactionParams;
import com.gameball.gameball.model.request.RewardPointBody;
import com.gameball.gameball.model.response.BaseResponse;
import com.gameball.gameball.model.response.HoldPointsResponse;

import io.reactivex.Completable;
import io.reactivex.Single;

public interface TransactionDataSourceContract
{
    Completable rewardPoints(RewardPointBody body);
    Single<BaseResponse<HoldPointsResponse>> holdPoints(HoldPointBody body);
}
